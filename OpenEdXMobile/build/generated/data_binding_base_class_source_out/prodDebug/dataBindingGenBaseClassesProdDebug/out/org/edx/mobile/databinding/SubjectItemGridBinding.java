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

public abstract class SubjectItemGridBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flRoot;

  @NonNull
  public final ImageView ivSubjectLogo;

  @NonNull
  public final TextView tvSubjectName;

  protected SubjectItemGridBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flRoot, ImageView ivSubjectLogo, TextView tvSubjectName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flRoot = flRoot;
    this.ivSubjectLogo = ivSubjectLogo;
    this.tvSubjectName = tvSubjectName;
  }

  @NonNull
  public static SubjectItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubjectItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubjectItemGridBinding>inflate(inflater, org.edx.mobile.R.layout.subject_item_grid, root, attachToRoot, component);
  }

  @NonNull
  public static SubjectItemGridBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubjectItemGridBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubjectItemGridBinding>inflate(inflater, org.edx.mobile.R.layout.subject_item_grid, null, false, component);
  }

  public static SubjectItemGridBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubjectItemGridBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubjectItemGridBinding)bind(component, view, org.edx.mobile.R.layout.subject_item_grid);
  }
}
