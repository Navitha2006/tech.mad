<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="20dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:text="Students Inside Tech Lounge"
        android:textSize="22sp"
        android:textStyle="bold"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <TextView
        android:id="@+id/tvCount"
        android:text="0"
        android:textSize="40sp"
        android:layout_marginTop="20dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

    <Button
        android:id="@+id/btnCheckIn"
        android:text="Check In"
        android:layout_marginTop="30dp"
        android:layout_width="200dp"
        android:layout_height="wrap_content"/>

    <Button
        android:id="@+id/btnCheckOut"
        android:text="Check Out"
        android:layout_marginTop="10dp"
        android:layout_width="200dp"
        android:layout_height="wrap_content"/>

</LinearLayout>
