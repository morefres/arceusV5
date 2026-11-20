.class public final synthetic Lfn/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfn/s;


# direct methods
.method public synthetic constructor <init>(Lfn/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/v;->a:Lfn/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lfn/v;->a:Lfn/s;

    invoke-static {v0}, Lfn/s$m;->a(Lfn/s;)V

    return-void
.end method
