package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class LayoutCourseDatesBannerBinding extends ViewDataBinding {
  @NonNull
  public final TextView bannerInfo;

  @NonNull
  public final AppCompatButton btnShiftDates;

  @NonNull
  public final LinearLayout containerLayout;

  protected LayoutCourseDatesBannerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView bannerInfo, AppCompatButton btnShiftDates,
      LinearLayout containerLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bannerInfo = bannerInfo;
    this.btnShiftDates = btnShiftDates;
    this.containerLayout = containerLayout;
  }

  @NonNull
  public static LayoutCourseDatesBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutCourseDatesBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutCourseDatesBannerBinding>inflate(inflater, org.edx.mobile.R.layout.layout_course_dates_banner, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutCourseDatesBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutCourseDatesBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutCourseDatesBannerBinding>inflate(inflater, org.edx.mobile.R.layout.layout_course_dates_banner, null, false, component);
  }

  public static LayoutCourseDatesBannerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutCourseDatesBannerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutCourseDatesBannerBinding)bind(component, view, org.edx.mobile.R.layout.layout_course_dates_banner);
  }
}
