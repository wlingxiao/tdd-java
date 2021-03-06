package tdd;

/**
 * 井字游戏
 * “井字游戏”是两个人使用纸和铅笔玩的一种游戏，双方轮流在一个3×3的网格中画X和O，最先在水平、垂直或对角线上将自己的3个标记连起来的玩家获胜。
 * 需求1：
 * 定义边界，棋子放在哪些地方非法
 * 可将棋子放在3×3棋盘上任何没有棋子的地方。
 * 测试分为三步：
 * 1. 如果棋子放在超出了X轴边界的地方，就引发RuntimeException异常；
 * 2. 如果棋子放在超出了Y轴边界的地方，就引发RuntimeException异常；
 * 3. 如果棋子放在已经有棋子的地方，就引发RuntimeException异常。
 */
public class TicTacToe {

    private Character[][] board = {{'\0', '\0', '\0'},
            {'\0', '\0', '\0'},
            {'\0', '\0', '\0'}};

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException("X is outside board");
        }
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }

}
