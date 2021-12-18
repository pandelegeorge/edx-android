package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;

public abstract class FragmentTabsBaseBinding extends ViewDataBinding {
  @NonNull
  public final ViewPager2 viewPager2;

  protected FragmentTabsBaseBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ViewPager2 viewPager2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.viewPager2 = viewPager2;
  }

  @NonNull
  public static FragmentTabsBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTabsBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTabsBaseBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_tabs_base, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTabsBaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTabsBaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTabsBaseBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_tabs_base, null, false, component);
  }

  public static FragmentTabsBaseBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTabsBaseBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTabsBaseBinding)bind(component, view, org.edx.mobile.R.layout.fragment_tabs_base);
  }
}
