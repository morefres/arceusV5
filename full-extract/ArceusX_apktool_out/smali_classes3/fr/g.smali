.class public final synthetic Lfr/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lfr/j;

.field public final synthetic c:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public synthetic constructor <init>(ZLfr/j;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lfr/g;->a:Z

    iput-object p2, p0, Lfr/g;->b:Lfr/j;

    iput-object p3, p0, Lfr/g;->c:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-boolean v0, p0, Lfr/g;->a:Z

    iget-object v1, p0, Lfr/g;->b:Lfr/j;

    iget-object v2, p0, Lfr/g;->c:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-static {v0, v1, v2}, Lfr/j;->g(ZLfr/j;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    return-void
.end method
