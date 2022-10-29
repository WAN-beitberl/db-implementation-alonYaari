import  java.util.*;

public class TableHW
{
    //main
    public static void main(String[] args)
    {
        matrix table = new matrix(3);
        table.InsertColumnNames("name" , "last name");
        table.InsertRow("israel" , "israeli");
        table.InsertRow("The" , "Gunners");
        System.out.println( table.getValue("name", 1));
        System.out.println( table.getValue("last name", 1));
    }

}

class matrix
{
    // Declare strings.
    private String firstName;
    private String secondName;
    private String[][] matrix;

    matrix(int rowNum)
    {
        this.matrix = new String[rowNum+1][2];//Creating a matrix
    }

    //Inserting data
    public void InsertColumnNames(String firstName, String secondName)
    {
        this.matrix[0][0] = firstName;
        this.matrix[0][1] = secondName;
    }

    // Set new data on a specific row.
    public void InsertRow(String firstName, String secondName)
    {
        int firstEmptyPlace = 0;
        //Looking for the first empty row.
        while (matrix[firstEmptyPlace][0] != null)
        {
            firstEmptyPlace++;
        }
        //If it hasn't left the matrix size.
        if (firstEmptyPlace != matrix.length)
        {
            matrix[firstEmptyPlace][0] = firstName;
            matrix[firstEmptyPlace][1] = secondName;
        }
        else
        {
            System.out.println("We have no place! your data will stay outside");
        }
    }

    //Returning Cell Value.
    public String getValue(String colName , int nindex)
    {
        nindex++;
        if (matrix[0][0].equals(colName)){return matrix[nindex][0];}
        else{return matrix[nindex][1];}
    }
}