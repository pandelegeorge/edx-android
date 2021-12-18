package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public abstract class FragmentCourseDatesPageBinding extends ViewDataBinding {
  @NonNull
  public final LayoutCourseDatesBannerBinding banner;

  @NonNull
  public final LinearLayout containerLayout;

  @NonNull
  public final LoadingIndicatorBinding loadingIndicator;

  @NonNull
  public final RecyclerView rvDates;

  @NonNull
  public final SwipeRefreshLayout swipeContainer;

  protected FragmentCourseDatesPageBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LayoutCourseDatesBannerBinding banner, LinearLayout containerLayout,
      LoadingIndicatorBinding loadingIndicator, RecyclerView rvDates,
      SwipeRefreshLayout swipeContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.banner = banner;
    setContainedBinding(this.banner);;
    this.containerLayout = containerLayout;
    this.loadingIndicator = loadingIndicator;
    setContainedBinding(this.loadingIndicator);;
    this.rvDates = rvDates;
    this.swipeContainer = swipeContainer;
  }

  @NonNull
  public static FragmentCourseDatesPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCourseDatesPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCourseDatesPageBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_course_dates_page, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCourseDatesPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCourseDatesPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCourseDatesPageBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_course_dates_page, null, false, component);
  }

  public static FragmentCourseDatesPageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCourseDatesPageBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCourseDatesPageBinding)bind(component, view, org.edx.mobile.R.layout.fragment_course_dates_page);
  }
}
