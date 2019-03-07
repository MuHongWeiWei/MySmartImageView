# MySmartImageView
在ImageView基礎上 新增一個直接讀URL圖片的方法


### Xml
     <com.example.tester.MySmatImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/iv"
        tools:ignore="MissingConstraints" />

### Java
    MySmatImageView imageView = findViewById(R.id.iv);
    imageView.setImageUrl("https://www.baidu.com/img/bd_logo1.png");
