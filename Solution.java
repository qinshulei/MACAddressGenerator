/*


*/

import java.util.*;

public class Solution {
    char[] maps = new char[] {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public String generateMac() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append('-');
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append('-');
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        builder.append(maps[random.nextInt(15)]);
        return builder.toString();
    }

    public static void main(String[] args){
        Solution s = new Solution();
        for (int i = 0; i < 1000; i++) {
            System.out.println("mac-vlan mac-address " + s.generateMac() +" vlan 67 priority 0");
        }
    }
}
