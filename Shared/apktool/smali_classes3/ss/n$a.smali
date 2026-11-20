.class public Lss/n$a;
.super Lss/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lss/n;->b(Lss/m$b;Lss/g;)Lss/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lss/m$b;

.field public final synthetic b:Lss/g;


# direct methods
.method public constructor <init>(Lss/m$b;Lss/g;)V
    .locals 0

    iput-object p1, p0, Lss/n$a;->a:Lss/m$b;

    iput-object p2, p0, Lss/n$a;->b:Lss/g;

    invoke-direct {p0}, Lss/n;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lss/m;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/n$a;->a:Lss/m$b;

    iget-object v1, p0, Lss/n$a;->b:Lss/g;

    new-instance v2, Lss/s;

    invoke-direct {v2}, Lss/s;-><init>()V

    invoke-interface {v0, v1, v2}, Lss/m$b;->a(Lss/g;Lss/r;)Lss/m;

    move-result-object v0

    return-object v0
.end method
