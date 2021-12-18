package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public abstract class FragmentMyCoursesListBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout contentErrorRoot;

  @NonNull
  public final LoadingIndicatorBinding loadingIndicator;

  @NonNull
  public final ListView myCourseList;

  @NonNull
  public final SwipeRefreshLayout swipeContainer;

  protected FragmentMyCoursesListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout contentErrorRoot, LoadingIndicatorBinding loadingIndicator,
      ListView myCourseList, SwipeRefreshLayout swipeContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentErrorRoot = contentErrorRoot;
    this.loadingIndicator = loadingIndicator;
    setContainedBinding(this.loadingIndicator);;
    this.myCourseList = myCourseList;
    this.swipeContainer = swipeContainer;
  }

  @NonNull
  public static FragmentMyCoursesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMyCoursesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMyCoursesListBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_my_courses_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMyCoursesListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMyCoursesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMyCoursesListBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_my_courses_list, null, false, component);
  }

  public static FragmentMyCoursesListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMyCoursesListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMyCoursesListBinding)bind(component, view, org.edx.mobile.R.layout.fragment_my_courses_list);
  }
}
