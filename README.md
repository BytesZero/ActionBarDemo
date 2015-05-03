# ActionBarDemo
actionBar的教程
---
1.获得ActionBar | [link](https://github.com/yy1300326388/ActionBarDemo/commit/e1c8ded7846d974c0ef1717d2fcd9eab9a8e3a24)
```java
//  获得ActionBar
ActionBar actionBar = getSupportActionBar();
```
2.显示／隐藏ActionBar | [link](https://github.com/yy1300326388/ActionBarDemo/commit/925949f4c5a2397448e859653292bf8e1e7a63a3)
```java
//显示ActionBar
actionBar.show();
//隐藏ActionBar
actionBar.hide();
```
3.设置ActionBar 的背景颜色| [link](https://github.com/yy1300326388/ActionBarDemo/commit/79d4926d0292228708903676697e2a3306818ffe)
![](https://github.com/yy1300326388/ActionBarDemo/blob/71bef6292a6cbfd51a7be9ca1b76de12221256ba/images_demo/set_bg.png)
```java
Drawable drawable=getResources().getDrawable(R.drawable.actionbar_bg);
//设置ActionBar的背景
actionBar.setBackgroundDrawable(drawable);
```
4.设置ActionBar 的Back| [link](https://github.com/yy1300326388/ActionBarDemo/commit/71bef6292a6cbfd51a7be9ca1b76de12221256ba)
![](https://github.com/yy1300326388/ActionBarDemo/blob/71bef6292a6cbfd51a7be9ca1b76de12221256ba/images_demo/show_back.png)
```java
//设置返回键
actionBar.setDisplayHomeAsUpEnabled(true);
```
5.设置ActionBar Back的返回事件| [link](https://github.com/yy1300326388/ActionBarDemo/commit/6c7d264f94553f8fbfd25ffc0c75cf5affaf279c)
```java
@Override
public boolean onOptionsItemSelected(MenuItem item) {
   switch (item.getItemId()){
       case android.R.id.home:{
            onBackPressed();
            break;
       }
   }
   return true;
}
```

