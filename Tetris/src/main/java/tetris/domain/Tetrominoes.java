package tetris.domain;

public enum Tetrominoes {
    I(new int[][]{{0, -1}, {0, 0}, {0, 1}, {0, 2}}),
    O(new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}}),
    T(new int[][]{{-1, 0}, {0, 0}, {0, 1}, {1, 0}}),
    J(new int[][]{{-1, 0}, {0, 0}, {1, 0}, {1, 1}}),
    L(new int[][]{{-1, 0}, {0, 0}, {1, 0}, {-1, 1}}),
    S(new int[][]{{-1, 0}, {0, 0}, {0, -1}, {1, -1}}),
    Z(new int[][]{{-1, 1}, {0, -1}, {0, 0}, {1, 0}});

    public int[][] coordinates;

    Tetrominoes(int[][] coordinates) {
        this.coordinates = coordinates;
    }
}
