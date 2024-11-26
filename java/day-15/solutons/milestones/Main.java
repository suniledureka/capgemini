package com.capgemini.milestones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

enum ActionEnum {
	appliedFilter, feature1Button, feature2Button, feature3Button, proceedButton
}

interface IAnalytics {
	public void registerAction(ActionEnum action);

	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore();

	public int getTotalNumberOfLoggedActions();

	public List<ActionEnum> getMostFrequentlyUsedActions();
}

interface IAnalyticsStore {
	public void storeActions(Queue<ActionEnum> q);

	public Queue<ActionEnum> getAllStoredActions();
}

class Analytics implements IAnalytics {
	private IAnalyticsStore analyticsStore;
	private int K;
	
	Queue<ActionEnum> actionQueue = new ArrayDeque<ActionEnum>();
	List<ActionEnum> allActions = new ArrayList<ActionEnum>();
	
	public Analytics(IAnalyticsStore analyticsStore, int k) {
		this.analyticsStore = analyticsStore;
		K = k;
	}

	@Override
	public void registerAction(ActionEnum action) {
		    allActions.add(action); //List
			actionQueue.offer(action); //Queue
			if(actionQueue.size() == K) {
				analyticsStore.storeActions(actionQueue);
				actionQueue.clear();
			}
	}

	@Override
	public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
		return actionQueue.size();
	}

	@Override
	public int getTotalNumberOfLoggedActions() {
		return allActions.size();
	}

	@Override
	public List<ActionEnum> getMostFrequentlyUsedActions() {
		Map<ActionEnum, Integer> map = new HashMap<ActionEnum, Integer>();
		for(ActionEnum ae : allActions) {
			if(map.containsKey(ae)) {
				Integer n = map.get(ae);
				map.put(ae, (n+1));
			}else {
				map.put(ae, 1);
			}
		}
		//---- finding the most frequently used action
		List<ActionEnum> mostlyUsed = new ArrayList<>();
		Optional<Map.Entry<ActionEnum, Integer>> optEntry = map.entrySet().stream().max((en1, en2) -> en1.getValue()-en2.getValue());
		if(optEntry.isPresent()) {
			Map.Entry<ActionEnum, Integer> maxEntry = optEntry.get();
			int maxValue = maxEntry.getValue();
			
			Set<Map.Entry<ActionEnum, Integer>> set = map.entrySet();
			for(Map.Entry<ActionEnum, Integer> entry : set) {
				if(entry.getValue() == maxValue) {
					mostlyUsed.add(entry.getKey());
				}
			}
		}
		return mostlyUsed;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String inp[];
		inp = br.readLine().split(" ");

		int totalNumberOfRequests = Integer.parseInt(inp[0]), K = Integer.parseInt(inp[1]);
		IAnalyticsStore analyticsStore = new AnalyticsStore();
		IAnalytics analytics = new Analytics(analyticsStore, K);

		for (int queryNumber = 1; queryNumber <= totalNumberOfRequests; queryNumber++) {
			inp = br.readLine().split(" ");
			switch (inp[0]) {
			case "registerAction":
				ActionEnum actionEnum = ActionEnum.valueOf(inp[1]);
				analytics.registerAction(actionEnum);
				break;
			case "getTotalNumberOfLoggedActions":
				int totalNumberOfLoggedEvents = analytics.getTotalNumberOfLoggedActions();
				System.out.println(totalNumberOfLoggedEvents);
				break;
			case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
				int x = analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore();
				System.out.println(x);
				break;
			case "getMostFrequentlyUsedActions":
				List<ActionEnum> li = analytics.getMostFrequentlyUsedActions();
				for (ActionEnum a : li) {
					System.out.println(a + " ");
				}
				out.print("\n");
				break;
			}
		}

		Queue<ActionEnum> q = analyticsStore.getAllStoredActions();
		for (ActionEnum a : q) {
			out.print(a.toString() + " ");
		}
		out.print("\n");

		out.flush();
		out.close();
	}
}

class AnalyticsStore implements IAnalyticsStore {
	private Queue<ActionEnum> storedEventEnums = new LinkedList<>();

	@Override
	public void storeActions(Queue<ActionEnum> q) {
		while (!q.isEmpty()) {
			storedEventEnums.add(q.poll());
		}
	}

	@Override
	public Queue<ActionEnum> getAllStoredActions() {
		Queue<ActionEnum> clonedActionEnums = new LinkedList<>(storedEventEnums);
		return clonedActionEnums;
	}
}
