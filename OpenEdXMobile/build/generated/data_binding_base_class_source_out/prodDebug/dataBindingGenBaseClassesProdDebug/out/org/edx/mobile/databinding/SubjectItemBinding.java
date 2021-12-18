package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class SubjectItemBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flRoot;

  @NonNull
  public final ImageView ivSubjectLogo;

  @NonNull
  public final TextView tvSubjectName;

  protected SubjectItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flRoot, ImageView ivSubjectLogo, TextView tvSubjectName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flRoot = flRoot;
    this.ivSubjectLogo = ivSubjectLogo;
    this.tvSubjectName = tvSubjectName;
  }

  @NonNull
  public static SubjectItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubjectItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubjectItemBinding>inflate(inflater, org.edx.mobile.R.layout.subject_item, root, attachToRoot, component);
  }

  @NonNull
  public static SubjectItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubjectItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubjectItemBinding>inflate(inflater, org.edx.mobile.R.layout.subject_item, null, false, component);
  }

  public static SubjectItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubjectItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubjectItemBinding)bind(component, view, org.edx.mobile.R.layout.subject_item);
  }
}
