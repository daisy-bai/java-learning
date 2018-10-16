package chapter5;

import java.util.*;

/**
 * 生成彩票号码
 */
public class MathDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MathDemo m = new MathDemo();
        String groupNum = in.nextLine();
        System.out.println("The result is :");
        m.generateLottery(groupNum);

    }

    public static void generateLottery(String groupNum) {
        int groupNumber = 0;
        groupNumber = Integer.parseInt(groupNum);

        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < groupNumber; i++) {
            List<String> startList = getHeadNumber();
            List<String> endList = getRearNumber();

            for (int m = 0; m < startList.size(); m++) {
                sbuilder.append(startList.get(m));
                // append()即为追加方法，用于添加彩票的前半段号码到字符串生成器中
            }
            sbuilder.append("    ");
            for (int n = 0; n < endList.size(); n++) {
                sbuilder.append(endList.get(n));
                // 添加彩票的后半段号码到字符串生成器中
            }
            sbuilder.append("\n");
        }
        System.out.println(sbuilder.toString());
    }

    public static List<String> getHeadNumber() {
        List<String> list = new ArrayList<String>();
        String lotteryNumber = "";
        for (int i = 1; i < 36; i++) {
            if (i < 10)
                list.add("0" + i + "  ");
            else
                list.add("" + i + "  ");
        }
        int roundIndex = 0;
        List<String> lotteryList = new ArrayList<String>();
        for (int j = 0; j < 5; j++) {
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);// 获取一个0到amount-1的随机数
            lotteryNumber = list.get(roundIndex);

            lotteryList.add(lotteryNumber);
            list.remove(roundIndex);
        }
        Collections.sort(lotteryList);
        return lotteryList;
    }

    public static List<String> getRearNumber() {
        List<String> list = new ArrayList<String>();
        String lotteryNumber = "";
        for (int i = 1; i < 13; i++) {
            if (i < 10)
                list.add("0" + i + "  ");
            else
                list.add("" + i + "  ");
        }
        int roundIndex = 0;
        List<String> lotteryList = new ArrayList<String>();
        for (int j = 0; j < 2; j++) {
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);// 获取一个0到amount-1的随机数
            lotteryNumber = list.get(roundIndex);

            lotteryList.add(lotteryNumber);
            list.remove(roundIndex);
        }
        Collections.sort(lotteryList);
        return lotteryList;
    }
}
