package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {
    //given the array of strings and the string to find, use the given start index to find the
    //min distance from the start index to the selection
    //
    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int startIndexBackwards = startIndex;
        int forwardCount = 0;
        int backwardCount = 0;
        while(!playList[startIndex].equals(selection)) {
            startIndex++;
            forwardCount++;
            if(startIndex >= playList.length) {
                startIndex = 0;
            }
        }
        while(!playList[startIndexBackwards].equals(selection)) {
            startIndexBackwards--;
            backwardCount++;
            if(startIndexBackwards < 0) {
                startIndexBackwards = playList.length - 1;
            }
        }
        return (Math.min(forwardCount, backwardCount));


    }
//        ArrayList<String> playlistArrayList = new ArrayList<String>(Arrays.asList(playList));
//        ArrayList<String> tempList = new ArrayList<String>();
//        tempList.addAll(playlistArrayList);
//       tempList.addAll(playlistArrayList);
//        tempList.addAll(playlistArrayList);
//
//        Integer countForward = 0;
//        Integer countBackward = 0;
//        int length = playlistArrayList.size() + startIndex;
//
//        for (int i = length; i < tempList.size(); i++) {
//            if (tempList.get(i) == selection) {
//                break;
//            }
//            countForward++;
//        }
//
//        for (int i = length; i > 0; i--) {
//            if (tempList.get(i) == selection) {
//                break;
//            }
//            countBackward++;
//        }
//
//        return Math.min(countForward, countBackward);
//
//    }
}
