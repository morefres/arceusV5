.class public final synthetic Lhp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhp/b;


# direct methods
.method public synthetic constructor <init>(Lhp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/a;->a:Lhp/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhp/a;->a:Lhp/b;

    invoke-static {v0}, Lhp/b;->g2(Lhp/b;)V

    return-void
.end method
