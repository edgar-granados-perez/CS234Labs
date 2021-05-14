/** 	File: MergeSort.java

	@author yanushka
 */

import java.util.Arrays;



/**	The class MergeSort contains static methods to sort an array
	of Comparable objects.
 */
public class MergeSort {
/**	Merge sort the Comparable array.
	@param array a Comparable array
 */
    public static void mergeSort( Object [] array ) {
	Object [] tmp = new Object[ array.length ];
	System.arraycopy( array, 0, tmp, 0, array.length );
	mergeSort( array, tmp, 0, array.length - 1 );
    }

/**	Recursively merge sort array from startNdx to endNdx.
	@param array a Comparable array
	@param tmp a Comparable array for copying
 	@param startNdx a non negative integer into list
 	@param endNdx a non negative integer into list larger than startNdx

	Compute midNdx as average of startNdx and endNdx.
	if midNdx > startNdx
	    Recursively call mergeSort on startNdx and midNdx.
	if endNdx > midNdx + 1 
	    Recursively call mergeSort on midNdx + 1 and endNdx.
	Merge sorted sublist from startNdx to midNdx and sorted sublist
	    from midNdx + 1 to endNdx.
 */
    public static void mergeSort( Object [] array, Object [] tmp, 
			   int startNdx, int endNdx ) {
	int midNdx = ( startNdx + endNdx ) / 2;
	if ( startNdx < midNdx )
	    mergeSort( array, tmp, startNdx, midNdx );
	if ( midNdx + 1 < endNdx )
	    mergeSort( array, tmp, midNdx + 1, endNdx );
	merge( array, tmp, startNdx, midNdx, endNdx );
    }

/** 	Stably merge sorted array from lo to mid with sorted array from mid+1
        to hi using tmp from lo to hi.
	@param array a Comparable array
	@param tmp a Comparable array for copying
	@param lo a non negative index into list
	@param mid a non negative index into list >= mid 
	@param hi a non negative index into list
 */
    private static void merge( Object [] array, Object [] tmp,
			int lo, int mid, int hi ) {
	System.arraycopy( array, lo, tmp, lo, hi - lo + 1 );

	int i = lo,
	    j = mid + 1;
	for ( int k = lo; k <= hi; k++ )
	    if ( i > mid )
		array[ k ] = tmp[ j++ ];
	    else if ( j > hi )
		// list.set( k, tmp.get( i++ ) );
		array[ k ] = tmp[ i++ ];
	    else if ( ( ( Comparable )tmp[ j ] ).compareTo( 
			( Comparable )tmp[ i ] ) < 0 )
		array[ k ] = tmp[ j++ ];
	    else
		array[ k ] = tmp[ i++ ];
    }
		
/**	Decide if the parameter is sorted.
	@param array an array of Comparable objects	
	@return true if array is in sorted order or false otherwise
 */
    public static boolean isSorted( Object [] array ) {
	boolean sorted = true;

	for ( int i = 1; ( i < array.length ) && sorted; i++ )
	    sorted = ( ( ( Comparable )array[ i - 1 ] ).compareTo( 
			 ( Comparable )array[ i ] ) <= 0 );

	return sorted;
    }

/**	@return a String representation of this object
 */
    public static String toString( Object [] array ) {
	return Arrays.toString( array ) + "\nsorted? " + isSorted( array );
    }
}
