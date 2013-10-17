Multiple Item Selector
======================
Multiple Item Selector provides a simple way for you to populate a dialog with a List, for the purpose of selecting multiple items.
The items selected by the user are returned via a simple listener in the form of a Collection. Have fun :)

## Configuration

** Activity **

  ``` java
public class MainActivity extends Activity implements MultipleItemSelector.OnClickListener<String>{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Some random text");
		strings.add("Another item");
		strings.add("yet another");
		
		MultipleItemSelector<String> multiple = new MultipleItemSelector<String>(this, 
				R.layout.multiple_selector, R.id.item_checkbox, R.id.item_text, strings,
				this);

		multiple.showDialog();
	}
	
	
		@Override
	public void onNegativeClick(DialogInterface dialog, int which) {
		// Add code here too handle on cancel 
		
	}

	@Override
	public void onPositiveClick(Collection<String> selectedItems_,
			DialogInterface dialog_, int which_) {
			
			//Add code here to handle here when OK is clicked
			
		for(String s : selectedItems_){
			Log.v(TAG, s);
		}
	
	}
  ``` 

**Layout code**

Simply define a TextView and a checkbox:

  ``` xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="15dp"
    android:orientation="horizontal" >

    <TextView
        android:id="@+id/item_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:padding="0dp"
        android:layout_centerVertical="true"
        android:textSize="14dp" />

    <CheckBox
        android:id="@+id/item_checkbox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_centerVertical="true"
        android:padding="0dp" />

</RelativeLayout>
  ```


