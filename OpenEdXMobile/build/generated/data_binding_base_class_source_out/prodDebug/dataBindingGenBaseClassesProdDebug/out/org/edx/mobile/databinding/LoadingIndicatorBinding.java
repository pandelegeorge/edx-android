package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.IconProgressBar;

public abstract class LoadingIndicatorBinding extends ViewDataBinding {
  @NonNull
  public final IconProgressBar loadingIndicator;

  protected LoadingIndicatorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, IconProgressBar loadingIndicator) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loadingIndicator = loadingIndicator;
  }

  @NonNull
  public static LoadingIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LoadingIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LoadingIndicatorBinding>inflate(inflater, org.edx.mobile.R.layout.loading_indicator, root, attachToRoot, component);
  }

  @NonNull
  public static LoadingIndicatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LoadingIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LoadingIndicatorBinding>inflate(inflater, org.edx.mobile.R.layout.loading_indicator, null, false, component);
  }

  public static LoadingIndicatorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LoadingIndicatorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LoadingIndicatorBinding)bind(component, view, org.edx.mobile.R.layout.loading_indicator);
  }
}
