package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class ActivityLaunchBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final ImageView edxLogo;

  @NonNull
  public final RelativeLayout rlRoot;

  @NonNull
  public final AppCompatButton signInTv;

  @NonNull
  public final AppCompatButton signUpBtn;

  protected ActivityLaunchBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout bottomLayout, ImageView edxLogo, RelativeLayout rlRoot,
      AppCompatButton signInTv, AppCompatButton signUpBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.edxLogo = edxLogo;
    this.rlRoot = rlRoot;
    this.signInTv = signInTv;
    this.signUpBtn = signUpBtn;
  }

  @NonNull
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLaunchBinding>inflate(inflater, org.edx.mobile.R.layout.activity_launch, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLaunchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLaunchBinding>inflate(inflater, org.edx.mobile.R.layout.activity_launch, null, false, component);
  }

  public static ActivityLaunchBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLaunchBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLaunchBinding)bind(component, view, org.edx.mobile.R.layout.activity_launch);
  }
}
