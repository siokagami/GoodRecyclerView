# GoodRecyclerView
基于RecyclerView封装了下拉刷新和上拉加载功能，并添加了失败、数据为空等提示
# Gradle
```groovy
compile 'com.siokagami.android.goodrecyclerview:GoodRecyclerView:1.0.0'
```

# Usage
### IN XML
```xml
<com.siokagami.android.goodrecyclerview.GoodRecyclerView
        android:id="@+id/goodsimple"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```
### IN Activity
```java
public void initView()
    {
        GoodRecyclerView goodRecyclerView = (GoodRecyclerView)findViewById(R.id.goodsimple); //init view
        goodRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));//add LayoutManager.
        /**
         * If your recyclerview need get data from network.Please define your adapter
         * as public variable .And use notifyDataSetChanged() to refresh.
         */
        GSAdapter gsAdapter = new GSAdapter();
        goodRecyclerView.setAdapter(gsAdapter);
        /**
         * If your RecyclerView need paging request to get data from the network,
         * please add the following code.
         */
        goodRecyclerView.setOnLoadDataListener(new GoodRecyclerView.OnLoadDataListener() {
            @Override
            public void onLoadData(int page) {
                //add your code
            }
        });
        goodRecyclerView.startLoadData(); // start load data
    }
```
### IN Adapter 
与RecyclerView的Adapter编写方法相同
### Method
|方法|说明|
|-------|-------|
|setOnLoadDataListener()|如需分页请求，请添加此监听器|
|startLoadData()|如设置分页请求需调用该方法来开始加载数据|
|reloadData()|重新加载数据|
|setLoadState()|设置RecyclerView的状态<br>·STATE_LOADING 加载中<br>·STATE_FAIL 加载失败<br>·STATE_EMPTY 数据为空|
# 说明
当在XML中添加之后会有报错信息显示，但是只要是有视图出现就可以暂时忽略错误，这个bug我还在修复。Simple还暂未编写完成，不过可以
参考我的github里面BeanSauce这个项目，这里面的使用了GoodRecyclerView。