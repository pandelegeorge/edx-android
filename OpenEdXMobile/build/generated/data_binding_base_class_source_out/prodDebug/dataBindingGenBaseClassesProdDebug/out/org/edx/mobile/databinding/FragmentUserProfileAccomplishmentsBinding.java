package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public abstract class FragmentUserProfileAccomplishmentsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView list;

  protected FragmentUserProfileAccomplishmentsBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, RecyclerView list) {
    super(_bindingComponent, _root, _localFieldCount);
    this.list = list;
  }

  @NonNull
  public static FragmentUserProfileAccomplishmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserProfileAccomplishmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserProfileAccomplishmentsBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_user_profile_accomplishments, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserProfileAccomplishmentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserProfileAccomplishmentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserProfileAccomplishmentsBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_user_profile_accomplishments, null, false, component);
  }

  public static FragmentUserProfileAccomplishmentsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentUserProfileAccomplishmentsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentUserProfileAccomplishmentsBinding)bind(component, view, org.edx.mobile.R.layout.fragment_user_profile_accomplishments);
  }
}
