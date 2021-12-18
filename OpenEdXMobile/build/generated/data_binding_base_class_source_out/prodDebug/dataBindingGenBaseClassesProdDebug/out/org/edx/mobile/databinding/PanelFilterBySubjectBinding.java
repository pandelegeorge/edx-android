package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PanelFilterBySubjectBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llSubjectContent;

  @NonNull
  public final RecyclerView rvSubjects;

  @NonNull
  public final TextView tvBrowseSubjects;

  protected PanelFilterBySubjectBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout llSubjectContent, RecyclerView rvSubjects,
      TextView tvBrowseSubjects) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llSubjectContent = llSubjectContent;
    this.rvSubjects = rvSubjects;
    this.tvBrowseSubjects = tvBrowseSubjects;
  }

  @NonNull
  public static PanelFilterBySubjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelFilterBySubjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelFilterBySubjectBinding>inflate(inflater, org.edx.mobile.R.layout.panel_filter_by_subject, root, attachToRoot, component);
  }

  @NonNull
  public static PanelFilterBySubjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelFilterBySubjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelFilterBySubjectBinding>inflate(inflater, org.edx.mobile.R.layout.panel_filter_by_subject, null, false, component);
  }

  public static PanelFilterBySubjectBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PanelFilterBySubjectBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PanelFilterBySubjectBinding)bind(component, view, org.edx.mobile.R.layout.panel_filter_by_subject);
  }
}
