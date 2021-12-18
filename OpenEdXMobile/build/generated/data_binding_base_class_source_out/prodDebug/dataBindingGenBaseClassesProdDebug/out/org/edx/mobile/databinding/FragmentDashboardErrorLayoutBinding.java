package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentDashboardErrorLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorMsg;

  protected FragmentDashboardErrorLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView errorMsg) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorMsg = errorMsg;
  }

  @NonNull
  public static FragmentDashboardErrorLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashboardErrorLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashboardErrorLayoutBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_dashboard_error_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDashboardErrorLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashboardErrorLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashboardErrorLayoutBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_dashboard_error_layout, null, false, component);
  }

  public static FragmentDashboardErrorLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDashboardErrorLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDashboardErrorLayoutBinding)bind(component, view, org.edx.mobile.R.layout.fragment_dashboard_error_layout);
  }
}
