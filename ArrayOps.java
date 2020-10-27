public class ArrayOps {
  public static int sum(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int summ = 0;
    for (int i = 0; i < arr.length; i++) {
      summ += arr[i];
    }
    return summ;
  }
  public static  int largest(int[]arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int a[] = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      int tot = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        tot += matrix[i][j];
      }
    }
  return a;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int a[] = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        int max = matrix[i][0];
        if (matrix[i][j] > max) {
          max = matrix[i][j];
        }
        a[i] = max;
      }
    }
    return a;
  }

  public static  int sum(int[][] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[0].length; j++) {
        sum += arr[i][j];
      }
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int a[] = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      int tot = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        tot += matrix[j][i];
      }
    }
  return a;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix[0].length; i++) {
      sum += matrix[0][i];
    }
    for (int i = 0; i < matrix.length; i++) {
      int newsum = 0;
      for (int j = 1; j < matrix[i].length; j++) {
        newsum += matrix[i][j];
      }
      if (sum != newsum) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][0];
    }
    for (int i = 0; i < matrix.length; i++) {
      int newsum = 0;
      for (int j = 1; j < matrix[i].length; j++) {
        newsum += matrix[j][i];
      }
      if (sum != newsum) {
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int sumrow = 0;
    int sumcol = 0;
    for (int i = 0; i < matrix[row].length; i++) {
      sumrow += matrix[row][i];
    }
    for (int i = 0; i < matrix.length; i++) {
      sumcol += matrix[i][col];
    }
    if (sumrow != sumcol) {
      return false;
    }
    return true;
  }
}
