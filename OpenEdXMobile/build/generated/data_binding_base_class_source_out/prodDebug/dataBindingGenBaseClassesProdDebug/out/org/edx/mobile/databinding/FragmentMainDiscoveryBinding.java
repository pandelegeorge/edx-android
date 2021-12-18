package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentMainDiscoveryBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flContainer;

  @NonNull
  public final RadioGroup options;

  @NonNull
  public final LinearLayout root;

  protected FragmentMainDiscoveryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flContainer, RadioGroup options, LinearLayout root) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flContainer = flContainer;
    this.options = options;
    this.root = root;
  }

  @NonNull
  public static FragmentMainDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMainDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMainDiscoveryBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_main_discovery, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMainDiscoveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMainDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMainDiscoveryBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_main_discovery, null, false, component);
  }

  public static FragmentMainDiscoveryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMainDiscoveryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMainDiscoveryBinding)bind(component, view, org.edx.mobile.R.layout.fragment_main_discovery);
  }
}
