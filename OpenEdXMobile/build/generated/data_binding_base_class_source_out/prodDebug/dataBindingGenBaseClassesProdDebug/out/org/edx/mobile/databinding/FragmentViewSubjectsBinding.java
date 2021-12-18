package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentViewSubjectsBinding extends ViewDataBinding {
  @NonNull
  public final GridView glSubjects;

  @NonNull
  public final LinearLayout llContent;

  @NonNull
  public final SearchView svSearchSubjects;

  protected FragmentViewSubjectsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, GridView glSubjects, LinearLayout llContent,
      SearchView svSearchSubjects) {
    super(_bindingComponent, _root, _localFieldCount);
    this.glSubjects = glSubjects;
    this.llContent = llContent;
    this.svSearchSubjects = svSearchSubjects;
  }

  @NonNull
  public static FragmentViewSubjectsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentViewSubjectsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentViewSubjectsBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_view_subjects, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentViewSubjectsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentViewSubjectsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentViewSubjectsBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_view_subjects, null, false, component);
  }

  public static FragmentViewSubjectsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentViewSubjectsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentViewSubjectsBinding)bind(component, view, org.edx.mobile.R.layout.fragment_view_subjects);
  }
}
