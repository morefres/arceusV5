.class public final synthetic Lpp/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lpp/g0;


# direct methods
.method public synthetic constructor <init>(Lpp/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp/z;->a:Lpp/g0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lpp/z;->a:Lpp/g0;

    invoke-static {v0, p1}, Lpp/g0;->d(Lpp/g0;Landroid/view/View;)V

    return-void
.end method
