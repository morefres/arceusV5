.class public Lvi/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/e;->e(Landroid/view/Menu;Landroid/view/MenuInflater;)Landroid/view/MenuItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvi/e;


# direct methods
.method public constructor <init>(Lvi/e;)V
    .locals 0

    iput-object p1, p0, Lvi/e$a;->a:Lvi/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lvi/e$a;->a:Lvi/e;

    invoke-virtual {p1}, Lvi/e;->f()V

    return-void
.end method
