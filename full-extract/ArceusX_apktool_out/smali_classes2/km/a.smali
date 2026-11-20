.class public Lkm/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lkm/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkm/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkm/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lkm/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lkm/a;->c:Lkm/j;

    return-void
.end method


# virtual methods
.method public final a()Lkm/j;
    .locals 1

    iget-object v0, p0, Lkm/a;->c:Lkm/j;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkm/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkm/a;->a:Ljava/lang/String;

    return-object v0
.end method
