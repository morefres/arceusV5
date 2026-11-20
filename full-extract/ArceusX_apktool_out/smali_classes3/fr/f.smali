.class public final synthetic Lfr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lfr/j;


# direct methods
.method public synthetic constructor <init>(Lfr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfr/f;->a:Lfr/j;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lfr/f;->a:Lfr/j;

    invoke-static {v0, p1}, Lfr/j;->a(Lfr/j;Landroid/view/View;)V

    return-void
.end method
