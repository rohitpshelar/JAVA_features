package com.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Synechron {

	public static void main(String[] args) {

			List<String> list = new ArrayList<>();
			list.add("A");

			list.add("B");

			list.add("C");

			for(String element : list) {

				list.remove(element);

			}

			System.out.println(list.size());

	}
}
