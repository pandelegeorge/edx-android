package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class ActivityDiscoveryLaunchBinding extends ViewDataBinding {
  @NonNull
  public final AuthPanelBinding authPanel;

  @NonNull
  public final ImageView ivEdxLogo;

  @NonNull
  public final LinearLayout llContent;

  @NonNull
  public final LinearLayout llRoot;

  @NonNull
  public final Space space;

  @NonNull
  public final SearchView svSearchCourses;

  @NonNull
  public final TextView tvLaunchText;

  @NonNull
  public final TextView tvSearchTitle;

  protected ActivityDiscoveryLaunchBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AuthPanelBinding authPanel, ImageView ivEdxLogo, LinearLayout llContent,
      LinearLayout llRoot, Space space, SearchView svSearchCourses, TextView tvLaunchText,
      TextView tvSearchTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.authPanel = authPanel;
    setContainedBinding(this.authPanel);;
    this.ivEdxLogo = ivEdxLogo;
    this.llContent = llContent;
    this.llRoot = llRoot;
    this.space = space;
    this.svSearchCourses = svSearchCourses;
    this.tvLaunchText = tvLaunchText;
    this.tvSearchTitle = tvSearchTitle;
  }

  @NonNull
  public static ActivityDiscoveryLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDiscoveryLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDiscoveryLaunchBinding>inflate(inflater, org.edx.mobile.R.layout.activity_discovery_launch, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDiscoveryLaunchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityDiscoveryLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityDiscoveryLaunchBinding>inflate(inflater, org.edx.mobile.R.layout.activity_discovery_launch, null, false, component);
  }

  public static ActivityDiscoveryLaunchBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityDiscoveryLaunchBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityDiscoveryLaunchBinding)bind(component, view, org.edx.mobile.R.layout.activity_discovery_launch);
  }
}
