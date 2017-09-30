package com.rabah.fitnesse;


import com.google.common.collect.Lists;
import com.rabah.services.PairManager;
import com.rabah.services.data.Pair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class PairFixture {
    private static final  Collection<Pair<String, Integer>> unsortedList = new ArrayList<>();

    public void addPair(String first, Integer second){
        Pair p = Pair.from(first,second);
        unsortedList.add(p);
    }


    public List<List<List<String>>> query(){
        List<Pair<String, Integer>> sort = new PairManager().sort(unsortedList);

        List<List<List<String>>> result = new ArrayList<>();
        int cpt=0;
        for(Pair<String,Integer> pair : sort) {
            result.add(Lists.newArrayList(
                    Lists.newArrayList("Rank", String.valueOf(cpt++)),
                    Lists.newArrayList("First", pair.getFirst()),
                    Lists.newArrayList("Second", String.valueOf(pair.getSecond()))
                    )
            );
        }
        return result;
    }
}
