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

public abstract class ButtonProgressIndicatorBinding extends ViewDataBinding {
  @NonNull
  public final IconProgressBar progressIndicator;

  protected ButtonProgressIndicatorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, IconProgressBar progressIndicator) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressIndicator = progressIndicator;
  }

  @NonNull
  public static ButtonProgressIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ButtonProgressIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ButtonProgressIndicatorBinding>inflate(inflater, org.edx.mobile.R.layout.button_progress_indicator, root, attachToRoot, component);
  }

  @NonNull
  public static ButtonProgressIndicatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ButtonProgressIndicatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ButtonProgressIndicatorBinding>inflate(inflater, org.edx.mobile.R.layout.button_progress_indicator, null, false, component);
  }

  public static ButtonProgressIndicatorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ButtonProgressIndicatorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ButtonProgressIndicatorBinding)bind(component, view, org.edx.mobile.R.layout.button_progress_indicator);
  }
}
