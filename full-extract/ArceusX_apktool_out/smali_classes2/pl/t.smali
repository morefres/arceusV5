.class public final synthetic Lpl/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpl/u;


# direct methods
.method public synthetic constructor <init>(Lpl/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpl/t;->a:Lpl/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lpl/t;->a:Lpl/u;

    invoke-static {v0}, Lpl/u;->a(Lpl/u;)V

    return-void
.end method
