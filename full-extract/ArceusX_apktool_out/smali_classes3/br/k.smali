.class public final synthetic Lbr/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbr/n;


# direct methods
.method public synthetic constructor <init>(Lbr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr/k;->a:Lbr/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lbr/k;->a:Lbr/n;

    invoke-static {v0}, Lbr/n;->j(Lbr/n;)V

    return-void
.end method
