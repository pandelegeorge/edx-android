package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class ViewSubjectsItemBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btViewSubjects;

  @NonNull
  public final FrameLayout flRoot;

  protected ViewSubjectsItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btViewSubjects, FrameLayout flRoot) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btViewSubjects = btViewSubjects;
    this.flRoot = flRoot;
  }

  @NonNull
  public static ViewSubjectsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewSubjectsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewSubjectsItemBinding>inflate(inflater, org.edx.mobile.R.layout.view_subjects_item, root, attachToRoot, component);
  }

  @NonNull
  public static ViewSubjectsItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ViewSubjectsItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ViewSubjectsItemBinding>inflate(inflater, org.edx.mobile.R.layout.view_subjects_item, null, false, component);
  }

  public static ViewSubjectsItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ViewSubjectsItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ViewSubjectsItemBinding)bind(component, view, org.edx.mobile.R.layout.view_subjects_item);
  }
}
