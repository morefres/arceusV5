.class public Lon/c0;
.super Lon/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lon/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lon/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lon/d0;->m(Lon/c0;)V

    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lon/c0;->g:Ljava/lang/String;

    return-void
.end method
