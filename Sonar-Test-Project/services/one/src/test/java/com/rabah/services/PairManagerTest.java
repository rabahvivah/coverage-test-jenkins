package com.rabah.services;

import com.google.common.collect.Lists;
import com.rabah.services.data.Pair;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class PairManagerTest {

    @Test
    public void sortOnFirst(){
        Pair<String, Integer> p1 = new Pair<>("one", 1000);
        Pair<String, Integer> p2 = new Pair<>("two", 0);
        Pair<String, Integer> p3 = new Pair<>("zero", 20);
        Collection<Pair<String, Integer>> list = Lists.newArrayList(p3,p2,p1);
        PairManager pairManager = new PairManager();
        assertEquals(pairManager.sort(list), Lists.newArrayList(p1, p2,p3));
    }

    @Test
    public void sortOnSecond(){
        Pair<String, Integer> p1 = new Pair<>("one", 1);
        Pair<String, Integer> p2 = new Pair<>("one", 2);
        Pair<String, Integer> p3 = new Pair<>("one", 3);
        Collection<Pair<String, Integer>> list = Lists.newArrayList(p3,p2,p1);
        PairManager pairManager = new PairManager();
        assertEquals(pairManager.sort(list), Lists.newArrayList(p1, p2,p3));
    }



}