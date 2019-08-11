package com.luba.todo.widgettest;


import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService {
        @Override
        public RemoteViewsFactory onGetViewFactory(Intent intent) {
            return new StackRemoteViewsFactory(this.getApplicationContext(), intent);
        }

    private class StackRemoteViewsFactory implements RemoteViewsFactory {
        public StackRemoteViewsFactory(Context applicationContext, Intent intent) {
        }

        @Override
        public void onCreate() {

        }

        @Override
        public void onDataSetChanged() {

        }

        @Override
        public void onDestroy() {

        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public RemoteViews getViewAt(int position) {
            return null;
        }

        @Override
        public RemoteViews getLoadingView() {
            return null;
        }

        @Override
        public int getViewTypeCount() {
            return 0;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }
    }
}


