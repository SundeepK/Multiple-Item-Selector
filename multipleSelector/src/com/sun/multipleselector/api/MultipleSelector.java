package com.sun.multipleselector.api;

import java.util.Collection;

import android.widget.ListAdapter;

public interface MultipleSelector<T> extends ListAdapter{

	public  Collection<T> getAllSelectedItems();
	
	public void addAllToAdapter(Collection<T> items_);
	
	public void clearAdapter();
	
	public void remove(T object_);
	
}
