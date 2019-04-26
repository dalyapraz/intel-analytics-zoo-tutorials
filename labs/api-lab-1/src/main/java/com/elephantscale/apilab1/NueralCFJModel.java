package com.elephantscale.apilab1;

import com.intel.analytics.zoo.pipeline.inference.AbstractInferenceModel;
import com.intel.analytics.zoo.pipeline.inference.JTensor;

import java.util.ArrayList;
import java.util.List;

public class NueralCFJModel extends AbstractInferenceModel {

    public NueralCFJModel(){

    }

    public List<List<JTensor>> preProcess(List<UserItemPair> userItemPairs){

        List<List<JTensor>> jts = new ArrayList<>();

        for(int i =0; i < userItemPairs.size(); i++){
            List<JTensor> input = new ArrayList<JTensor>();
            input.add(new JTensor(new float[]{userItemPairs.get(i).getUserId(),
                    userItemPairs.get(i).getItemId()}, new int[]{2}));
            jts.add(input);
        }

        return jts;
    }
}

