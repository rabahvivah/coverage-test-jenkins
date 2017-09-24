package com.rabah.services;


import com.google.common.collect.Lists;
import com.rabah.services.data.Pair;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PairManager {

    public static final Comparator<Pair<String, Integer>> NATIVE_COMPARATOR = new Comparator<Pair<String, Integer>>() {
        public int compare(Pair<String, Integer> o1, Pair<String, Integer> o2) {
            int i = o1.getFirst().compareTo(o2.getFirst());
            if (i != 0)
                return i;

            return Integer.compare(o1.getSecond(), o2.getSecond());
        }
    };
    private Pair<String, Integer> pair;


    public List<Pair<String, Integer>> sort(Collection<Pair<String, Integer>> collection) {
        List<Pair<String, Integer>> list = Lists.newArrayList(collection);
        Collections.sort(list, NATIVE_COMPARATOR);
        return list;
    }
}
